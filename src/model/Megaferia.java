
package model;

import modelrepository.IStandRepository;
import modelrepository.IAuthorRepository;
import modelrepository.IManagerRepository;
import modelrepository.INarratorRepository;
import modelrepository.IPublisherRepository;
import modelrepository.IBookRepository;

import modelrepository.impl.StandRepositoryImpl;
import modelrepository.impl.AuthorRepositoryImpl;
import modelrepository.impl.ManagerRepositoryImpl;
import modelrepository.impl.NarratorRepositoryImpl;
import modelrepository.impl.PublisherRepositoryImpl;
import modelrepository.impl.BookRepositoryImpl;

public class Megaferia {

    private static Megaferia instance;

    private IStandRepository standRepository;
    private IAuthorRepository authorRepository;
    private IManagerRepository managerRepository;
    private INarratorRepository narratorRepository;
    private IPublisherRepository publisherRepository;
    private IBookRepository bookRepository;

    private Megaferia() {
        this.standRepository = new StandRepositoryImpl();
        this.authorRepository = new AuthorRepositoryImpl();
        this.managerRepository = new ManagerRepositoryImpl();
        this.narratorRepository = new NarratorRepositoryImpl();
        this.publisherRepository = new PublisherRepositoryImpl();
        this.bookRepository = new BookRepositoryImpl();
    }

    public static Megaferia getInstance() {
        if (instance == null) {
            instance = new Megaferia();
        }
        return instance;
    }

    public IStandRepository getStandRepository() {
        return standRepository;
    }

    public IAuthorRepository getAuthorRepository() {
        return authorRepository;
    }

    public IManagerRepository getManagerRepository() {
        return managerRepository;
    }

    public INarratorRepository getNarratorRepository() {
        return narratorRepository;
    }

    public IPublisherRepository getPublisherRepository() {
        return publisherRepository;
    }

    public IBookRepository getBookRepository() {
        return bookRepository;
    }
}