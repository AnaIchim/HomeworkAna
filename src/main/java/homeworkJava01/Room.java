package homeworkJava01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Room extends Floor {
    private String typeofRoom;
    private String sizeOfRoom;
    private int roomCapacity;
    static int noOfSeats = 0;
    {
        noOfSeats +=1;
    }

}
