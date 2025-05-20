package courier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Courier {
    private String login;
    private String password;

    public static Courier from(ModelCourier modelCourier) {
        return new Courier(modelCourier.getLogin(), modelCourier.getPassword());
    }}
