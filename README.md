# Example E2E Flow for Solace Spring Cloud Stream

Implements some dummy POJOs and shows end to end flow between a Supplier, Function, and Consumer.  
   
Based off https://start.spring.io/#!dependencies=solace,cloud-stream

SUPPLIER => `topic/out/supplier`  
`topic/out/supplier` => CONSUMER  
`topic/out/supplier` => FUNCTION => `topic/out/processor`
