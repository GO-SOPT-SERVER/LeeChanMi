package sopt.org.ThirdSeminar.infrastructure;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sopt.org.ThirdSeminar.domain.Alarm;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class AlarmRepository implements CustomRepository<Alarm> {
    private final EntityManager em;
    @Override
    public void save(Alarm alarm) {
        em.persist(alarm);
    }
    @Override
    public Optional<Alarm> findById(Long id) {
        Alarm alarm = em.find(Alarm.class, id);
        return Optional.ofNullable(alarm);
    }

    public List<Alarm> findByUserId(Long userId) {
        List<Alarm> result = em.createQuery("select a from Alarm a where a.user.id = :userId", Alarm.class)
                .setParameter("userId", userId)
                .getResultList();

        return result;
    }
}
