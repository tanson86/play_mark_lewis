console.log('React')

const ce = React.createElement

//function StatelessHello(props){
//    return ce('div', null, `Hello ${props.toWhat}`);
//}
//
////use class only when you want statehandling
//class Hello extends React.Component {
//  constructor(props){
//  super(props);
//  this.state = {clickCount:0}
//  }
//  render() {
//    return ce('div', {onClick: (e)=>this.clickHandler(e)}, `Hello ${this.props.toWhat} - clickCount ${this.state.clickCount}`);
//  }
//
//  clickHandler(e){
//    this.setState({clickCount: this.state.clickCount+1});
//  }
//}
//
//class SimpleForm extends React.Component {
//constructor(props){
//    super(props);
//    this.state = {textInput:""};
//}
//render() {
//return ce('input',{type:"text", value: this.state.textInput, onChange: (e) => this.changeHandler(e)});
//}
//
//changeHandler(e){
//this.setState({textInput: e.target.value})
//}
//}


const csrfToken = document.getElementById("csrfToken").value;
const validatePath = document.getElementById("validatePath").value;
const dataPath = document.getElementById("data").value;

class Version4MainComponent extends React.Component {
  constructor(props) {
    super(props);
    this.state = { loggedIn: false };
  }

  render() {
    if (this.state.loggedIn) {
      return ce(TaskListComponent, { doLogout: () => this.setState( { loggedIn: false }) });
    } else {
      return ce(LoginComponent, { doLogin: () => this.setState( { loggedIn: true }) });
    }
  }
}

class LoginComponent extends React.Component {
    constructor(props){
        super(props);
        this.state = {loginName:"",loginPwd:"",createName:"",createPwd:"",loginMsg:"",createMsg:""};
    }

    render(){
        return ce('div',null,
        ce('h2',null,'Login:'),
        ce('br'),
        'Username:',
        ce('input',{type:"text",id:"loginName",value: this.state.loginName, onChange: (e) => this.changeHandler(e)}),
        ce('br'),
        'Password:',
        ce('input',{type:"password",id:"loginPwd",value: this.state.loginPwd, onChange: (e) => this.changeHandler(e)}),
        ce('br'),
        ce('button', {onClick: e=> this.login(e)}, 'Login'),
        ce('span',{id:"login-msg"},this.state.loginMsg),
        ce('h2',null,'Createuser:'),
        ce('br'),
        'Username:',
        ce('input',{type:"text",id:"createName",value: this.state.createName, onChange: (e) => this.changeHandler(e)}),
        ce('br'),
        'Password:',
        ce('input',{type:"password",id:"createPwd",value: this.state.createPwd, onChange: (e) => this.changeHandler(e)}),
        ce('br'),
        ce('button', {onClick: e=> this.create(e)}, 'Create'),
        ce('span',{id:"create-msg"},this.state.createMsg));
    }

    changeHandler(e){
//    console.log(e.target['id']);
    this.setState({[e.target['id']]: e.target.value})
    }

    login(){
        const username = this.state.loginName;
        const password = this.state.loginPwd;
        fetch(validatePath,{

            method: 'POST',
            headers: {'Content-Type':'application/json','Csrf-Token': csrfToken},
            body: JSON.stringify({ username, password })

        }).then(res => res.json()).then(data => {
        if(data){
            console.log(data);
            this.props.doLogin();
        }else{
            this.setState({loginMsg:"Login failed!!"});
        }
        });
    }
}

class TaskListComponent extends React.Component {

constructor(props){
super(props);
this.state = {tasks:[],newTask:""}
}

//lifecycle hook for react and is executed only once after componenet creation
componentDidMount() {
    this.loadTasks();
  }

  render() {
        return ce('div',null,
        'Tasklist',
        ce('br'),
        ce('ul',null,this.state.tasks.map((task,index)=>ce('li',{key:index},task))),
        ce('br'),
        ce('div',null, ce('input',{type:'text',value:this.state.newTask,onChange:e=>this.changeHandler(e)},null),ce('button', null, 'Add task')),
        ce('br'),
        ce('button',{onClick: e=>this.props.doLogout()},'Logout'));
  }

  changeHandler(e){
    this.setState({newTask:e.target.value});
  }

  loadTasks() {
      fetch(dataPath).then(res => res.json()).then(tasks => this.setState({ tasks }));
    }

}


const root = ReactDOM.createRoot(document.getElementById('react-root'));
root.render(ce(Version4MainComponent, null, null));