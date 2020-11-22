# Multi-Module Spring Boot

This project is a simple example on how to split up your spring boot application into multiple sub-modules.

Splitting your application gives you following advantages:
* Clear separation of independent parts (e.g. multiple APIs in one app)
* Ensuring clean architecture
  * e.g. Controllers should not directly access DAOS, but use Services
  * Controller-Module -> Service-Module -> DAO-Module
* Possibility to export certain modules to Nexus as a library (e.g. Model-Module for Client Apps)
