package movie;

import legoset.Minifig;
import legoset.YearAdapter;
import lombok.Data;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;

@Data
public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;


    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private java.util.Set<String> tags;
    private List<Minifig> minifigs;



}
