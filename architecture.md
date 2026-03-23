# System Architecture

## Components
- API Gateway
- Order Service
- Delivery Service
- Tracking Service
- Database
- Cache (Redis)

## Flow
User → Order Service → Assign Delivery → Track Order

## Key Design
- Real-time tracking
- Scalable services
- Load balancing
