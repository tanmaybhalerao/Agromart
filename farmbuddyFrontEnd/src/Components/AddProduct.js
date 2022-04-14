import React, { Component } from 'react'

export default class addproduct extends Component{

    
    constructor(props){
      super(props)
      this.state={
               pname:"",
               quantity:"",
               price:"",
               description:"",
               productimage:"",
               categoryid:"",
             farmerid: JSON.parse(localStorage.getItem("loggedinuser")).farmer_id

            
        }
    }

    handleInput=(e)=>{
        const nm=e.target.name;
        const val=e.target.value;
        this.setState({[nm]:val});

    }
    SubmitInfo=(e)=>{  
        e.preventDefault();
        const requestThrough={
           method:'POST',
           headers:{
               'Content-Type':'application/json'
           },
           body:JSON.stringify({
            pname:this.state.pname,
            quantity:this.state.quantity,
            price:this.state.price,
            description:this.state.description,
            productimage:this.state.productimage,
            categoryid:this.state.categoryid,
           farmerid:this.state.farmerid,
           })
        }
    
    fetch('http://localhost:8080/addproduct',requestThrough)
    .then(res=>res.json());
    alert("Product Added");
    }
    render() 
    {
    return (
        <div>
            <div className="container">
                <div className="row">
                    <div className="card col-md-6 offset-md-3 offset-md-3">
                        <h3 className="text center ">ADD PRODUCT</h3>
                        <div className="card-body align-items-center ">
                            <form>
                                <div className='form-group'>
                                    <label for="pname">Product Name:</label>
                                    <input type='text' placeholder="Enter Product Name " name="pname" className='form-control' onChange={this.handleInput}></input>

                                </div>

                                <div className='form-group'>
                                    <label for="quantity">Quantity:</label>
                                    <input type='number' placeholder="Enter Quantity " name="quantity" className='form-control'onChange={this.handleInput}></input>
                                </div>

                                <div className='form-group'>
                                    <label for="price">Price:</label>
                                    <input type='text' placeholder="Enter Price " name="price" className='form-control'onChange={this.handleInput}></input>
                                </div>


                                <div className='form-grpoup'>
                                    <label for="description">Description:</label>
                                    <br />
                                    <input type='text' placeholder="Enter Description" name="description"  className='form-control'onChange={this.handleInput}></input>
                                </div>
                                <div className='form-group'>
                                    <label for="productimage"> Product Image :</label>
                                    <br />
                                    <input type='Number' placeholder="Add Product Image "  name="productimage" className='form-control'onChange={this.handleInput}></input>
                                    <br />
                                </div>
                                <div className='form-group'>
                                    <label for="categoryid">Choose Category:</label>
                                    <select name="categoryid" className='form-control'onChange={this.handleInput}>  
                                        <option value="1">Vegetables</option>
                                        <option value="2">fruits</option>
                                        <option value="3">Grains</option>
                                        <option value="4">DairyProducts</option>
                                        <option value="5">Poultry</option>
                                        <option value="6">Rice</option>
                                        <option value="7">Wheat</option>
                                        <option value="8">Spices</option>
                                        <option value="9">LiveStock</option>
                                        <option value="10">Cotton</option>
                                    </select>
                                    <br></br>
                                </div>
                               {/* <div className='form-group'>
                                    <label for="farmerid">Farmer Id:</label>
                                    <input type='number' placeholder="Enter Farmerid " name="farmerid" className='form-control'onChange={this.handleInput}></input>
                               </div>*/}
                                <button className='btn btn-success' onClick={this.SubmitInfo}>Submit</button>
                                <button className='btn btn-danger'>Reset</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       )
    }
}
