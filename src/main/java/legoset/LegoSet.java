package legoset;
import lombok.Data;
import java.util.List;
import javax.xml.bind.annotation.*;

@Data
public class LegoSet {
    private java.time.Year year;
    private int pieces;
    private java.util.Set<String> tags;
    private java.util.List<Minifig> minifigs;

}
