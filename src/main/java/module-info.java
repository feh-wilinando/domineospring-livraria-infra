module com.domineospring.infra {
    requires transitive com.domineospring.domain;

    requires spring.data.commons;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.beans;
    requires spring.context;

}