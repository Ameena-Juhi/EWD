CREATE TABLE persistence.StudentList (
	Id INT auto_increment NOT NULL,
	Ranks INT NOT NULL,
	Name varchar(100) NOT NULL,
	Score INT NOT NULL,
	CONSTRAINT StudentList_PK PRIMARY KEY (Id)
)