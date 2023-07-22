package open.api.in.spring.boot.vo;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import org.springframework.lang.Nullable;

@Value
@AllArgsConstructor
public class ItemToDoVo {
    @NonNull String id;
    @NonNull String title;
    @Nullable
    String description;
    boolean done;
}
