package com.puntawat.design_pattern.prototype;

import com.puntawat.design_pattern.prototype.model.Book;
import com.puntawat.design_pattern.prototype.model.InvalidInput;
import com.puntawat.design_pattern.prototype.model.Recommendation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        List<Recommendation> recommendations = new ArrayList<>();
        String selected;
        List<Book> books = new ArrayList<>();
        while (true) {
            try {
                System.out.println("\u001B[4mB\u001B[0mooks (B)");
                System.out.println("\u001B[4mR\u001B[0mecommendation (R)");
                System.out.println("\u001B[4mQ\u001B[0muit (Q)");
                System.out.print("Select: ");
                selected = sc.nextLine();
                if (selected.equalsIgnoreCase("q")) {
                    break;
                } else if (selected.equalsIgnoreCase("b")) {
                    System.out.println("\u001B[4mV\u001B[0miew Books (V)");
                    System.out.println("\u001B[4mC\u001B[0mreate new book (C)");
                    System.out.println("\u001B[4mB\u001B[0mack (B)");
                    System.out.print("Select: ");
                    selected = sc.nextLine();
                    if (selected.equalsIgnoreCase("v")) {
                        books.forEach(System.out::println);
                    } else if (selected.equalsIgnoreCase("c")) {
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        System.out.print("Author: ");
                        String author = sc.nextLine();
                        System.out.print("Genre: ");
                        String genre = sc.nextLine();
                        System.out.print("Publication Year: ");
                        String publicationYear = sc.nextLine();
                        Book book = new Book(author, title, genre, publicationYear);
                        books.add(book);
                    } else if (!selected.equalsIgnoreCase("b")) {
                        throw new InvalidInput();
                    }
                } else if (selected.equalsIgnoreCase("r")) {
                    System.out.println("\u001B[4mV\u001B[0miew, edit, and clone recommendations (V)");
                    System.out.println("\u001B[4mC\u001B[0mreate a new recommendation (C)");
                    System.out.println("\u001B[4mB\u001B[0mack (B)");
                    System.out.print("Select: ");
                    selected = sc.nextLine();
                    if (selected.equalsIgnoreCase("v")) {
                        for (int i = 0; i < recommendations.size(); i++) {
                            System.out.printf("%d. %s%n", i + 1, recommendations.get(i).getTargetAudience());
                        }
                        System.out.println("\u001B[4mB\u001B[0mack (B)");
                        System.out.print("Select: ");
                        selected = sc.nextLine();
                        if (!selected.equalsIgnoreCase("b")) {
                            int index;
                            try {
                                index = Integer.parseInt(selected) - 1;
                            } catch (NumberFormatException e) {
                                throw new InvalidInput();
                            }
                            try {
                                var recommendation = recommendations.get(index);
                                System.out.println("Clone (C)");
                                System.out.println("Edit (E)");
                                System.out.println("\u001B[4mB\u001B[0mack (B)");
                                System.out.print("Select: ");
                                selected = sc.nextLine();
                                if (selected.equalsIgnoreCase("c")) {
                                    recommendations.add(recommendation.clone());
                                } else if (selected.equalsIgnoreCase("e")) {
                                    System.out.printf("Target Audience (%s): ", recommendation.getTargetAudience());
                                    selected = sc.nextLine();
                                    if (!selected.isBlank()) {
                                        recommendation.setTargetAudience(selected);
                                    }
                                    for (int i = 0; i < books.size(); i++) {
                                        var book = books.get(i);
                                        System.out.printf("%d. %s%n", i + 1, book);
                                    }
                                    System.out.print("Select to add: ");
                                    selected = sc.nextLine();
                                    if (!selected.isBlank()) {
                                        try {
                                            index = Integer.parseInt(selected) - 1;
                                            recommendation.addBook(books.get(index));
                                        } catch (NumberFormatException | IndexOutOfBoundsException e) {
                                            throw new InvalidInput();
                                        }
                                    }
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new InvalidInput();
                            }
                        }
                    } else if (selected.equalsIgnoreCase("c")) {
                        System.out.print("Target Audience: ");
                        recommendations.add(new Recommendation(sc.nextLine()));
                    } else if (!selected.equalsIgnoreCase("b")) {
                        throw new InvalidInput();
                    }
                } else {
                    throw new InvalidInput();
                }
            } catch (InvalidInput e) {
                System.out.println("Invalid Input");
            }
        }
    }
}
