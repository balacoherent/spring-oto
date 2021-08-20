package springboototo.springoneToOne.Baseresponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter

public class BaseResponse<T> {
    String StatusCode;
    String StatusMsg;
    private T Data;

}
