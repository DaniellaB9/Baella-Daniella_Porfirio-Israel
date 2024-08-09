package dao;

import java.util.List;

public interface IDao <T>{
    //crear
    T guardar (T t);

    //consultar
    List<T> listarTodos();

}
