# ORM (Object Relational Mapping) with JPA (Java Persistence API)

## Business Competences
Be able to work with databases through an Object Relational Mapping Framework. The focus is on
java/JPA, but the core concepts are widely applicable in almost all technologies "out there".

### [Day 1](Day1) Introduction to ORM 
What/why is an ORM, install eclipselink+mysql dependencies, generate tables,
generate classes (reverse JPA), the persistence unit, the Entity class, the
EntityManager.

### Readings
[ORM](https://en.wikipedia.org/wiki/Object-relational_mapping). Only read the first section, to get an overall idea about ORM. This is a concept you will find in almost all modern technologies (Java, .Net, JavaScipt, PHP etc..)

[Java Persistence](https://en.wikibooks.org/wiki/Java_Persistence) (Wikibook). This should be your main reference for most of you JPA-related questions. 

**Important when you read the Wiki** In most of the "technical" sections, you will find two examples. One, who specifies the mapping with annotations and another (the old way) who does it via XML-mappings *We will ONLY use annotation based mappings, so you can ALWAYS skip the XML-parts*. Read the following for day-1
* 3.3 [What is JPA](https://en.wikibooks.org/wiki/Java_Persistence/What_is_JPA%3F)
* 3.7 [Why use JPA or ORM?](https://en.wikibooks.org/wiki/Java_Persistence/Why_use_JPA_or_ORM%3F)
* 4.0 [Java Persistence/Persistence Products](https://en.wikibooks.org/wiki/Java_Persistence/Persistence_Products) Skim only (we will be using EclipseLink)
* 5.0 [Mapping](https://en.wikibooks.org/wiki/Java_Persistence/Mapping) Read down to the Access Type Section.
* 5.1, 5.2, 5.4, 5.6](https://en.wikibooks.org/wiki/Java_Persistence) Skim these sections, so you know where to come back, when you start with the exercises
* 6.2  [Persisting (Inserting, Updating, Merging](https://en.wikibooks.org/wiki/Java_Persistence) Read 1.1 -1.4 (skip the Advanced Section)

### [Day 2](Day2) - Relationships 
Relationships, cardinality, directionality and Inheritance (only red students)

### [Day 3](Day3) - Inheritance and JPQL
JPQL-queries 
