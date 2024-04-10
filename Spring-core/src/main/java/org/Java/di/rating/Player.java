package org.Java.di.rating;

public record Player(String name, String role, String country) { }

record PlayerRating(String name, double rating){}

record PlayerWithRatting(String name,String role,String country, double ratting){ }
