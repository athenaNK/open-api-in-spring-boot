package open.api.in.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;
import org.springframework.lang.Nullable;

@Value
@AllArgsConstructor
public class ItemToDo {
   @NonNull String id;
   @NonNull String title;
   @Nullable String description;
   boolean done;
}
