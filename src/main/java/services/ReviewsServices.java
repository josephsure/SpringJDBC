/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;

import dao.DAOFactory;
import model.Customer;
import model.Review;

/**
 *
 * @author Laura
 */
public class ReviewsServices {


    private DAOFactory dao;

    public ReviewsServices() {
        this.dao = new DAOFactory();
    }


    public int updateReview(Review review){
        return dao.getDAOReviews().update(review);
    }
    public List<Review> getAllReviews() {

        return dao.getDAOReviews().getAll();
    }

    public int deleteReview( int id) {
        return dao.getDAOReviews().delete(id);
    }

    public List<Review> searchByItem(int id) {
        return dao.getDAOReviews().getReviewByItem(id);
    }

    public Review createReview() {
        Review rev = null;
        return rev;    }

    public boolean addReview(Review review) {
        return dao.getDAOReviews().save(review);
    }

    public List<Review> searchByCustomer(int id) {
        return dao.getDAOReviews().getReviewByCustomer(id);
    }
}
