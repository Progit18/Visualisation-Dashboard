CREATE TABLE data (
    id INT AUTO_INCREMENT PRIMARY KEY,
    intensity INT,
    likelihood INT,
    relevance INT,
    year INT,
    country VARCHAR(255),
    topics VARCHAR(255),
    region VARCHAR(255),
    city VARCHAR(255),
    end_year INT,
    sector VARCHAR(255),
    pest VARCHAR(255),
    source VARCHAR(255),
    swot VARCHAR(255)
);

LOAD DATA INFILE 'C:\Users\KIIT\OneDrive\Desktop\Visualisation dashboard'
INTO TABLE data
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 LINES
(intensity, likelihood, relevance, year, country, topics, region, city, end_year, sector, pest, source, swot);