package academy.learnprogramming.config.service;

import academy.learnprogramming.config.model.TodoData;
import academy.learnprogramming.config.model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoitemServiceImpl implements TodoItemService {

    // == fields ==
    @Getter
    private final TodoData data = new TodoData();

    // == public methods ==
    @Override
    public void addItem(TodoItem toAdd) {
        data.addItem(toAdd);

    }

    @Override
    public void removeItem(int id) {
    data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
    data.updateItem(toUpdate);
    }


}
