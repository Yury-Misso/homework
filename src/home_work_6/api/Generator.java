package home_work_6.api;

import home_work_6.dto.MethodGenerate;

import java.util.Collection;
import java.util.Random;


public interface Generator<T> {
    T generateElement(MethodGenerate methodGenerate);

    void fillCollection(Collection<T> collection, int size, MethodGenerate methodGenerate);


}
