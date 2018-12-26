package com.ami.makemoneyby.main.My.bean;

/**
 * Created by admin on 2018/4/9.
 */

public class TaskBean {

    /**
     * code : 200
     * data : {"code_key":"5ad55edf98f6f","url":"data:image/png;base64,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"}
     * msg : 获取成功
     */

    private String code;
    private DataBean data;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * code_key : 5ad55edf98f6f
         * url : data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAUAAAABkCAMAAADABBkMAAAAgVBMVEXz+/5pRZa/n6XItqTanJ2j2pielqbBvqaj36DC0Kaos7yZs6zh5PHQzeSLcrC/ttd6W6OuoMqcib2Nopd+fJZ3apabx5eYl7KAbqSQia1wUpq8p6KAYZmwmaCYfZ2ki56Mb5uGkptwWJegkKB/Y5qKcpy2rqSUuJ2rn6J3a5iUtJey68QaAAAJUElEQVR4nO2diXLbNhCGSUuxbBl3m6Zt0qZper//AxbYBUBQvBYUeE30j+uxG1GEPu4JgHRVldHpVOiN+vTysuCbT+t6bb4vpUX5ZQF8eyt+eosOv+aMh6bl+MFYjwDwUl3ga55OoJkHjyob4AKiAbyP4HJ6caK//G0RC0QlY+pC3C3AXC0AEIwvzSEWXueiHg/g+dz7v5cAeKs+p3gAzNDdAF9fX+1/xceVp00B3ufCjt3rpgDPlt62AO+pDBDdlgAdu3MXILBbC+AdBDcHiOg2BHindgvQFYEH4Ld9DBwEeBhtnYUHYuCxtNcsfBitAfDdu+b7QzP0AHinLDr8Iumlr0H4tpUFENuDB8BUOQAR3QNgS++8KK99AOyTY5fhwSsCbE9RZ4hxVnoshbRqDAR4+QS5qOtaSCHvODXTouZZR0gjlBJ68sKtnoVzAQI+KylqlYcgvoMWitt30Bm1nVa1lyG8OgHIpdVS7nK7zESR9J9Dc8cg2wgtPDjcHSyIicHaa8RnjyJctQCQGX+QWgThnL0K/qMIrq0TZxIM8NB+lfmOCrDhJ3QlBcUGnaTSJp7PLIDQh8AcgBKoWecT6MQ1OZAl8KxBGM7k9++pLuz5CcmYdOenndHCMzqc0UaN8gSfwX9zADJ3KWthh+JcEAIZdVyqgSe5NAqiGQ2g9vTAFDn1ojF7xRRcbiWM5nbYtIFm6Pm5+U6TcdRk+BEvMHFcpg0P0VMBhoRv38R5JSVucHBfpqWlLbVwQ52X8sbk2OXwQ2r4I8QlcGJNOlRaeIybJhu8/4HYXnBmax48qzcqCkBAVrM4bE7L33nKBci4avKGDE5MvLLW8kyM6d6mSBaopT2rgh89CULUYOi+ODSNhynSOLP0/JxlgLIV9TKdWIWQ5BzZvwUJoBA6oHBmrwXF5DlWSnix5W4AQgRqOTHYJMmJISQl8JxIAJU9LJyUGUGrR2QNR+HIOA50AYB5ERAuq2p8tnFiymeCqnFOKaHqxofJ8hZooGd3xYNNyuXTcK5YjdVz+DCQQqhO3JhRplTd+DBZWHDZ4UK7qaSx8fee3r2QhE+8wYnr4MSUsTVmxKQ2dGNUqTfaSprGQdWaaTBDDS2d0Et4cK58OpvnxAZfFkuZimhT7qohfEvPXb6Pn36Z3kisa2O0BPTCtcRKli8D8wXD6TixoTknts6xuao5KZ36lkxI6KSx/zb1r9M7sZV1fMHBSZTtQ4j939IyN9Vz48TT15fVaXNq30fTwro7JLbSlbuE1uZ/nTyMu6JJcTyh3oX9VQFY4rP61iZH1FSCrpqpOLE54OEaodnWGBKngUgYp8RDxV5m0PVt9RyduIntQ7stfB8BpaCLahUtt4LlQg9jqUMg+PwbKfG7QtVIgTPAMyd/y+u2BebBiZtPNAQQ4pfPvtJbEyU1wqyZwpIOcH4iTskwoVM3JpyqkMZ218V5rI4T+9/PoL5D00qQhRKSwAFeZpM3wg4+TI6ftvdEN16P4Oj2xE4LHGwyjm9ww5SK81LXq7PZD7RPFX0YLtFnzMPkysnmHOXdeLVKehRg0wL78XCfWKJJDAJMPvL1R3vQlWhIyhu9g336CMGQhAMyluEquvFamcQCHNkk26meDTpxDGekLXs/hZRKeG2o3x3s0yn48GQG19AN+2UwTSwVigjoDRMccuLw7ySAOUGw7cPah4wpGhz6ONf7YCHjLtdKTozsugSfrKqeFhgTS8sChyEytNvrz1gRk9toGQImCz48cZCxAG3TXeHyiD2GLbEu0qsBgI4eEIxO3JpbbUxpKA1X6FauqL1e3THVEMDX19b29dSHL5fgw+OziW4+Ji4lgb/Y3nglH+4HCOzw+20LzMaauZSEgXkB4ZYC3VX4IPrTMBySHOdwffE+fLloHz5vAbZvb5A4RI/MzadCbzz12YtoLAaiE8dMDNRkWgd21AYB3P3PEAR7LLC78dri+t2d46u7Dy34cGfUVTpq7QO1/80Sl0vtUOhoJAujGULUwxaYwf4Ji4W4UiHiWo/CINhjuF2AflWj/gNu5HMhkdXv+1y4Gbap2+tKUo9d5bXk+eEnAmPiWCXwwaIiDWaBA3woHwR7D2n//vLy4nz9T3vAXw6gNJzbNu0G4Ntby4d9592sK2m2PcDIz7MIJf5oQ5Hg8BMrGNilkRZDb15sx0C3Vehva09fwYctQDcnayRrA7wN3CHxtNaVNl4WSfgBQcHC9N5YUXuTDLQJ0xBa2CDYn3rSLIxbrb74PHz5x89o367p+RAYAXIP0DRnFmtOKPSoxQ+qK4n2N77jrJ2F0QjCRi3KNJ3ftftvDcfw5pL1uHCa+lTtUz4IavEZVUxSe/QPLOetnp4uF/sV78fmmiklzEQvkQK0kYunu9woLhW2PQvICVJFk59YVXZhT2sbJmw1LWDCbcDcR1UQIAjo5T1ToZUSWLrLjThPHLY9Q28LS5zqP8dualneuOlUP5WtiXOPHZUHSH6p7UYsu/O5nVPj5LyrMibeIfhj3PbsNvq6qVVkN7mvQYu4BONa6Vmr0uMA87ez3w3Qr2tOe341Oq1G29nFebR1OXq+15vesdEowBkPTcjxXiC47WMpYEO729w/frXG7r7HGYBhF84k6ABStySNz8pMa70b90cvsqNXFCB9V+HIrAxJ6z35YMSF8XsxgHFjMOWlxwEIGnLhp34Pvg8gTXfej7+yC+dG6/kA87ZlztceXLi8nrO3ps/WIZ7+kq38myNm6m3TB+gs94iG1QBuKvJtfDO0ngtvJ+oN8o1ybpjL3Nt/QI0+ogGe9tMpLxZ9vPTRNP6IgTO5wzqdqqUea7xrTUz1ZDz0DOh9ewQnnhKSBbDcqI6mQhZYbDyHU4kY+ADYq/4s3KtvGeCwMmZIHgD7dPRHPj60D+2tpU+W2w+iki39/bEuf7l9e+2qpT8iwB357wHhVTu0wCJa42+PofY0rXm5lMsht393ZyE97SwLF3ThuQ/VzFP/Su92KhkD1+AXNXhr6co6mgWGvQYAbw8EywFcKwYmLrweQOJK1T31wVpZOFrgqj5MA7in+mBQCHDdv+lCfJx4xu6tDZUAnLTAchU3yQIXMr6hJcKZmz8SF56ywIIeRQW4SI80sESYDxDY0evAkh5FBLhMDCw2PT4LIEGEHXIZLlyeYD/AOfu3Brec9ormUf8DeuFnlbFThYcAAAAASUVORK5CYII=
         */

        private String code_key;
        private String url;

        public String getCode_key() {
            return code_key;
        }

        public void setCode_key(String code_key) {
            this.code_key = code_key;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}