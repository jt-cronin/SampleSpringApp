-- CREATE MARVEL TABLE
CREATE TABLE T_MARVEL
(
    MARVEL_ID       int          NOT NULL,
    NAME            varchar(max) NOT NULL,
    CATEGORY        varchar(11) NOT NULL,
    GENDER          varchar(6)  NULL,
    HOME            varchar(max) NOT NULL,
    INTELLIGENCE    varchar(max) NOT NULL,
    STRENGTH        varchar(max) NOT NULL,
    SPEED           varchar(max) NOT NULL,
    FIGHTING_SKILLS varchar(max) NOT NULL,
    ROW_CREATE_TSP  datetime     NOT NULL
);

-- CREATE DC TABLE
CREATE TABLE T_DC
(
    DC_ID           int          NOT NULL,
    NAME            varchar(max) NOT NULL,
    CATEGORY        varchar(11) NOT NULL,
    GENDER          varchar(6)  NULL,
    IDENTITY        varchar(11) NOT NULL,
    ROW_CREATE_TSP  datetime     NOT NULL
);
