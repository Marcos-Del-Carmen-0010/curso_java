package s21_pooCRUDInterface.Modelo;

import java.util.Objects;

public class BaseEntity {
    protected Integer id;
    private static int idBase;

    BaseEntity() {
        this.id = ++idBase;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity base = (BaseEntity) o;
        return Objects.equals(id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
