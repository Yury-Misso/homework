package home_work_7;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessEncoding {
    private static final List<String> encodingTypeList
            = Arrays.asList("windows-1251", "CESU-8", "IBM00858", "IBM437", "IBM775",
            "IBM850", "IBM852", "IBM855", "IBM857", "IBM862", "IBM866",
            "ISO-8859-1", "ISO-8859-2", "ISO-8859-4", "ISO-8859-5",
            "ISO-8859-7", "ISO-8859-9", "ISO-8859-13", "ISO-8859-15",
            "KOI8-R", "KOI8-U", "US-ASCII", "UTF-8", "UTF-16",
            "UTF-16BE", "UTF-16LE", "UTF-32", "UTF-32BE", "UTF-32LE",
            "x-UTF-32BE-BOM", "x-UTF-32LE-BOM", "windows-1250",
            "windows-1252", "windows-1253",
            "windows-1254", "windows-1257", "Not available",
            "x-IBM737", "x-IBM874", "x-UTF-16LE-BOM");

    public static BufferedReader getBufferedReaderWithEncoding(File file) {

        List<EncodingPercent> encodingPercentList = new ArrayList<>();

        for (String typeEncoding : encodingTypeList) {

            encodingPercentList.add(
                    new EncodingPercent(typeEncoding
                            , getPercent(file, typeEncoding)));
        }

        if (encodingPercentList.size() > 0) {
            String encodingTrueType = encodingPercentList.stream().max((e1, e2) -> (int) ((e1.getPercentTrue() * 100)
                    - (e2.getPercentTrue() * 100))).get().getTypeEncoding();

            try {
                System.out.println(encodingTrueType);
                return new BufferedReader(
                        new InputStreamReader(new FileInputStream(file), encodingTrueType));
            } catch (UnsupportedEncodingException | FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                return new BufferedReader(
                        new InputStreamReader(new FileInputStream(file)));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static double getPercent(File file, String typeEncoding) {
        int countAlphabet = 0;
        int lengthLine = 0;
        int sequenceCount = 0;
        int tempSequenceCount = 0;

        try (BufferedReader reader
                     = new BufferedReader(
                new InputStreamReader(new FileInputStream(file), typeEncoding))) {

            String line;
            int maxCheck = 9;
            int countCheck = 0;
            String[] alphabet;


            while ((line = reader.readLine()) != null) {
                lengthLine += line.length();
                alphabet = line.split("");
                for (String s : alphabet) {
                    if (s.matches("[a-zA-zА-я]")) {
                        countAlphabet++;
                        tempSequenceCount++;
                    } else {
                        if (tempSequenceCount > sequenceCount) {
                            sequenceCount = tempSequenceCount;
                        }
                        tempSequenceCount = 0;
                    }
                }

                if (countCheck == maxCheck) break;
                countCheck++;
            }

        } catch (IOException e) {
            // не хочу выяснять что там поддерживается
            //TODO нужно разобраться
            //throw new RuntimeException(e);
        }

        if (sequenceCount > 4) {
            return (double) countAlphabet / lengthLine;
        } else return 0;
    }


    private static class EncodingPercent {
        String typeEncoding;
        double percentTrue;

        public EncodingPercent(String typeEncoding, double percentTrue) {
            this.typeEncoding = typeEncoding;
            this.percentTrue = percentTrue;
        }

        public String getTypeEncoding() {
            return typeEncoding;
        }

        public double getPercentTrue() {
            return percentTrue;
        }
    }
}
