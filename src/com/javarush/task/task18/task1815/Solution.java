package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements ATableInterface {
        ATableInterface one;
        public TableInterfaceWrapper(ATableInterface one) {
            this.one = one;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            one.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return one.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            one.setHeaderText(newHeaderText);
        }
    }

    public interface ATableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}