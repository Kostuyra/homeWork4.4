ALTER TABLE Student
ADD CONSTRAINT min_age CHECK (age >= 16);

ALTER TABLE Student
ALTER COLUMN name SET NOT NULL;

ALTER TABLE Student
ADD CONSTRAINT unique_name UNIQUE(name);

ALTER TABLE Faculty
ADD CONSTRAINT name_color_unique UNIQUE (name, color);

ALTER TABLE Student
ALTER COLUMN age SET DEFAULT 20;


