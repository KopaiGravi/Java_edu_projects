# Java_edu_projects
PD32 Borshch Maksym
# Library Management System

This is a simple Java application for managing a library. The system allows librarians to handle books,
DVDs, and patrons. It includes functionalities such as adding and removing items, registering patrons,
lending and returning items, and displaying lists of available and borrowed items.

Project Structure
The project is organized into the following packages:

org.example.models: Contains classes representing items (Book, DVD, Patron).
org.example.services: Contains the Library class and the IManageable interface.

Code Overview

Book and DVD classes extend the abstract class Item.
The Library class implements the IManageable interface for managing items and patrons.
The Patron class represents a library patron.
The App class in the default package is the main entry point for the application.
