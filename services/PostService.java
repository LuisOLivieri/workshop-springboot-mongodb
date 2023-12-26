package com.curso.WorkshopMongoDB.services;

import com.curso.WorkshopMongoDB.domain.Post;
import com.curso.WorkshopMongoDB.domain.User;
import com.curso.WorkshopMongoDB.dto.UserDTO;
import com.curso.WorkshopMongoDB.repository.PostRepository;
import com.curso.WorkshopMongoDB.repository.UserRepository;
import com.curso.WorkshopMongoDB.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public List<Post> findByTitle(String text){
        return repo.findByTitle(text);
    }
    public List<Post> fullSearch(String text, Date minDate, Date maxDate){
        maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
        return repo.fullSearch(text, minDate, maxDate);

    }

}
