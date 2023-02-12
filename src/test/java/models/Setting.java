package models;

import enums.Gender;
import enums.WeightType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(setterPrefix = "set")
public class Setting    {
    private Gender gender;
    private String birthday;
    private String weight;
    private WeightType weightType;
    private String country;
    private String region;
    private String city;
    private String postalCode;
}