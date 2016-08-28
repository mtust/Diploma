package excecutor;

import entity.Data;
import entity.InputData;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by tust on 28.08.2016.
 */
@Slf4j
public class CreateInputVectorsExcecutor extends BaseExcecutor {

    private Data data;
    private InputData inputData;

    public void init() {
        data = Data.getData();
        inputData = InputData.getInputData();


    }

    public void excecute() {
        inputData.setInputTrainMatrix(data.getTrainMatrix()
                .extractMatrix(0, data.getTrainMatrix().numRows(), 0, data.getTrainMatrix().numCols()
                        - inputData.getOutputsNumber()));
        inputData.getInputTrainMatrix().print();
    }
}
