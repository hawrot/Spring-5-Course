package academy.learnprogramming.config.service;

import academy.learnprogramming.config.model.TodoData;
import academy.learnprogramming.config.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem todoItem);

    TodoData getData();
}
