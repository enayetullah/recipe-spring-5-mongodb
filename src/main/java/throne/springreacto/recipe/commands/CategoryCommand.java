package throne.springreacto.recipe.commands;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryCommand {
    private String id;
    private String description;
}
