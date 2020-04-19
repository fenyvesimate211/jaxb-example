package legoset;
import lombok.Data;

import java.time.Year;
import legoset.YearAdapter;
import java.util.List;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;


    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    private java.util.Set<String> tags;
    private java.util.List<Minifig> minifigs;



}
