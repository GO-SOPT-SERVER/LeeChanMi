package sopt.org.ThirdSeminar.infrastructure;

import java.util.Optional;

public interface CustomRepository<T> {
    public void save(T object);

    public Optional<T> findById(Long Id);
}
