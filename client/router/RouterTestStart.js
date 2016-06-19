Router.configure({
   layoutTemplate: 'layout',
    loadingTemplate: 'loading', //  라우터 이동간에 로딩시간에 나오는거
    notFoundTemplate: 'notFound',    //  url이 틀렷을떄  http://localhost:3000/contd 이렇게

});
// 위에꺼는 좀 전연적이다.

Router.route('/', function() {this.render('home');});

Router.route('/about', { name:'about' });
// 교수님은 주로 위에 처럼한다.

Router.route('/press',  { name : 'press' });

Router.route('/writing', { template:'writing' });
