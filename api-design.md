# API Design

## Place Order
POST /order

{
  "user_id": 1,
  "items": ["Pizza", "Burger"]
}

## Track Order
GET /order/{id}

## Assign Delivery
POST /assign
