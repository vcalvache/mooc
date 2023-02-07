import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBegining(){
        assertEquals(0, this.management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowListByOne(){
        String text = "hello";
        management.add(text);
        assertEquals(1, this.management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList(){
        management.add("write a test");
        assertTrue(this.management.exerciseList().contains("write a test"));
    }

    @Test
    public void exerciseCanBeMarkedAsCompleted(){
        management.add("New exercise");
        management.markAsCompleted("New exercise");
        assertTrue(management.isCompleted("New exercise"));
    }
    
}
