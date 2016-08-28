package entity;

import lombok.Getter;
import lombok.Setter;
import org.ejml.simple.SimpleMatrix;

/**
 * Created by tust on 27.08.2016.
 */
@Getter
@Setter
public class Data {


    private Data() {
    }

    public static synchronized Data getData() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }

    private static Data data;

    private SimpleMatrix trainMatrix;


}
