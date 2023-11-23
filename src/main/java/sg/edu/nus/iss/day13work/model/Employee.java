package sg.edu.nus.iss.day13work.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    
    //this NotEmpty annotation means it will throw a message if the first name is empty
    @NotEmpty(message = "FIrst Name is mandatory")
    //throws a message if the name is not within these characters
    @Size(min = 3, max = 100, message = "First name must be between 3 to 100 characters")
    private String firstName;

    @NotEmpty(message = "FIrst Name is mandatory")
    //throws a message if the name is not within these characters
    @Size(min = 3, max = 100, message = "First name must be between 3 to 100 characters")
    private String lastName;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is a mandatory field")
    //throws a message if the name is not within these characters
    @Size(max = 100, message = "Email length exceeds 30 characters")
    private String email;

    @Pattern(regexp = "(\\8|9)[0-9]{7}", message = "Invalid phone number")
    private String phoneNo;

    @Min(value = 1500, message = "Minimum salary starts from 1500")
    @Max(value = 500000, message = "Maximum salary cannot exceed 500,000")
    private Integer salary;

    @DateTimeFormat(pattern = "yyyy-mm-dd")
    @Past(message = "Date of birth must be past")
    private Date birthDay;

    @Digits(fraction = 0, integer = 6, message = "Postal code format must be 6 digits")
    @Min(value = 111111, message = "Starts from 111111")
    @Max (value = 899999, message = "Ends at 899999")
    private Integer PostalCode;

}
