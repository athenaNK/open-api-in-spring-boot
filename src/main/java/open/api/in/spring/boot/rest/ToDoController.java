package open.api.in.spring.boot.rest;

import com.google.common.collect.ImmutableList;
import open.api.in.spring.boot.vo.ItemToDoVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The scope of this project is to understand how OpenApi is used
 * to create api documentation in Spring Boot
 * Thus implementation of the controllers makes no difference
 */

@RestController
@RequestMapping("/api")

public class ToDoController {

    @PostMapping("/create")
    public ResponseEntity<ItemToDoVo> createItem(@RequestBody ItemToDoVo item) {
        //todo create service and a map for the items
        return ResponseEntity.ok(item);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable String id) {
        return ResponseEntity.ok("Item Deleted");
    }

    @GetMapping("/items")
    public ResponseEntity<List<ItemToDoVo>> getItems() {
        return ResponseEntity.ok(ImmutableList.of(new ItemToDoVo("1", "first", null, true)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemToDoVo> getItem(@PathVariable String id) {
        return ResponseEntity.ok(new ItemToDoVo("1", "first", null, true));

    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ItemToDoVo> updateToDoItem(@PathVariable String id,
                                                 @RequestBody ItemToDoVo item,
                                                 @CookieValue(required = false) String canEdit,
                                                 @RequestHeader Boolean fromHost,
                                                 @RequestParam Boolean isClient) {

        return ResponseEntity.ok(item);
    }
}
