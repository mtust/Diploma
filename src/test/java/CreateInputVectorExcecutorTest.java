import entity.Data;
import entity.InputData;
import excecutor.BaseExcecutor;
import excecutor.CreateInputVectorsExcecutor;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by tust on 28.08.2016.
 */
@Slf4j
public class CreateInputVectorExcecutorTest {



    private BaseExcecutor createInputVectorsExcecutor = new CreateInputVectorsExcecutor();

    @Before
    public void init(){
        createInputVectorsExcecutor.init();
        double[][] d = {{1, 2, 1.1, 2.1, 4}, {1, 2, 1.1, 2.1, 4}, {1, 2, 1.1, 2.1, 4}};
        Data.getData().getTrainMatrix().print();
        InputData.getInputData().setOutputsNumber(2);
    }

    @Test
    public void excecutorTest(){

        createInputVectorsExcecutor.excecute();

    }


}
