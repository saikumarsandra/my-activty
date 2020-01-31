import { Calculator } from "./calculator"


describe("Testing function calc1 of Calculator", ()=>{

    
    it('Testing calc1 for negative values', ()=>{    
        // test code
        let calc = new Calculator();
        let response = calc.calc1(-5);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(0);
    })

    it('Testing calc1 for positive values', ()=>{
        let calc = new Calculator();
        let response = calc.calc1(5);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(6);
    })



    
    it('Testing calc2 for sqrt values', ()=>{    
        // test code
        let calc = new Calculator();
        let response = calc.calc2(9);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(3);
    })

    it('Testing calc2 for sqrt values', ()=>{
        let calc = new Calculator();
        let response = calc.calc2(25);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(5);
    })

})
