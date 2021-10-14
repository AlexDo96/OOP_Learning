**Context:**
- Different attribute data set
- If constructor overloading -> multiple contructors
- If only contructor (true, null) -> Logic become more complex
- Immutable Objects

**Usage:**
- Using the concept ENCAPSULATION
- In main Class from Constructor, attributes: private
- INNER static class Builder:
  + Same attributes with main class
  + Service methods (attribute) -> Builder
- Finally in the Builder class:
  + Example: build -> House -> house: Immutable