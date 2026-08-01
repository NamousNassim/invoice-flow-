# InvoiceFlow Core

**InvoiceFlow Core** is a command-line domain application built with plain Java.

It is intentionally developed without:

* Spring
* A database
* A web server

The goal is to understand Java fundamentals clearly before introducing a framework that creates, injects, or manages objects automatically.

## Business Scenario

A small service company needs a system that can:

* Register clients.
* Register products and services.
* Create invoices containing one or more invoice lines.
* Calculate:

  * Subtotal
  * Tax
  * Total amount
  * Paid amount
  * Remaining amount
* Record payments.
* Automatically update invoice status.
* Search and list invoices.
* Generate simple reports using the Java Stream API.
* Reject invalid business operations using meaningful custom exceptions.
