CREATE TABLE staff(
StaffID INT NOT NULL,
StaffName VARCHAR(25),
PRIMARY KEY (StaffID)
);

CREATE TABLE product(
ProductID INT NOT NULL,
ProductName VARCHAR(50),
ProductPrice INT NOT NULL,
PRIMARY KEY(ProductID)
);

CREATE TABLE receipt(
RecepitID INT NOT NULL,
RecepitDate Date,
StaffID INT NOT NULL,
PRIMARY KEY(RecepitID),
CONSTRAINT receipt_StaffID_FK FOREIGN KEY(StaffID) REFERENCES staff(StaffID)
);

CREATE TABLE receipt_product(
RecepitID INT NOT NULL,
ProductID INT NOT NULL,
QuantityOrdered INT,
PRIMARY KEY(RecepitID, ProductID),
CONSTRAINT recepit_product_RecepitID_FK FOREIGN KEY(RecepitID) REFERENCES recepit(RecepitID),
CONSTRAINT recepit_product_ProductID_FK FOREIGN KEY(ProductID) REFERENCES product(ProductID)
);