package com.stepan.cupriyanovich.dao;

import com.stepan.cupriyanovich.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUserById(int id) {
        try {
            entityManager.remove(entityManager.find(User.class, id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        try {
            user = entityManager.find(User.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
