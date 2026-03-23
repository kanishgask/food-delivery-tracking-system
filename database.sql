CREATE TABLE Users (
    user_id INT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    user_id INT,
    status VARCHAR(50),
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

CREATE TABLE DeliveryPartners (
    partner_id INT PRIMARY KEY,
    name VARCHAR(100),
    status VARCHAR(50)
);
