package entity;

import lombok.Getter;
import lombok.Setter;
import org.ejml.simple.SimpleMatrix;

/**
 * Created by tust on 28.08.2016.
 */
@Getter
@Setter
public class InputData {

    private InputData() {
    }

    public static synchronized InputData getInputData() {
        if (inputData == null) {
            inputData = new InputData();
        }

        return inputData;
    }

    private static InputData inputData;


    private int outputsNumber;

    private SimpleMatrix inputTrainMatrix;


}
