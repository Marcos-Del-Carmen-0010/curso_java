package s21_pooCRUDInterface.repocitorio;

public interface IHome<T> extends MetothsCRUD<T>, OrdenableCRUD<T>, PaginableCRUD<T>, IContable {
}
