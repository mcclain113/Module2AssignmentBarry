package edu.wctc;

public interface Interactable {
    default String interact(Player x){return "";}


    String interact();
}
