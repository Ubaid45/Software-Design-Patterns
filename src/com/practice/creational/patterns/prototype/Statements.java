package com.practice.creational.patterns.prototype;
import java.util.List;

public class Statements implements Cloneable {

        private String sql;
        private List<String> parameters;
        private Record record;

        public Statements(String sql, List<String> parameters, Record record) {
            this.sql = sql;
            this.parameters = parameters;
            this.record = record;
        }

        public Statements clone() {
            try {
                return (Statements) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;
        }

        public List<String> getParameters() {
            return parameters;
        }

        public Record getRecord() {
            return record;
        }

        public String getSql() {
            return sql;
        }

        public void setParameters(List<String> parameters) {
            this.parameters = parameters;
        }

        public void setRecord(Record record) {
            this.record = record;
        }

        public void setSql(String sql) {
            this.sql = sql;
        }
    }


